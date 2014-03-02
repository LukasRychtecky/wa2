from flask_restful import fields


def find_or_none(id, seq):
    return next(filter(lambda obj: obj.id == id, seq), None)


class Item(object):

    rest_fields = {
        'id': fields.Integer,
        'name': fields.String
    }

    def __init__(self, name):
        self.name = name
        self.id = None

    def __unicode__(self):
        return self.name


class Order(object):

    rest_fields = {
        'id': fields.Integer,
        'items': fields.Nested(Item.rest_fields)
    }

    def __init__(self, id=None):
        self.id = id
        self.items = []

    def add(self, item):
        item.id = len(self.items) + 1
        self.items.append(item)

    def remove(self, item):
        if not item is None:
            self.items.remove(item)

    def find(self, id):
        return find_or_none(id, self.items)


class Storage(object):

    def __init__(self):
        self.orders = []

    def create_order(self):
        return self.add(Order())

    def add(self, order):
        order.id = len(self.orders) + 1
        self.orders.append(order)
        return order

    def find(self, id):
        return find_or_none(id, self.orders)
