from app.models import Order
from flask import abort
from flask_restful import Resource, marshal_with
from models import Storage

storage = Storage()
storage.create_order()


class OrderService(Resource):

    @marshal_with(Order.rest_fields)
    def get(self, id):
        order = storage.find(id)
        if order is None:
            abort(404)
        return order

    def put(self, id):
        pass

    def delete(self, id):
        pass


class OrderListService(Resource):

    @marshal_with(Order.rest_fields)
    def post(self):
        order = storage.create_order()
        return order, 201, {'Location': '/rest/orders/' + str(order.id)}

    @marshal_with(Order.rest_fields)
    def get(self):
        return storage.orders
