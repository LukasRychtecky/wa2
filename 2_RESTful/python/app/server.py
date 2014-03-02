from flask import Flask
from flask_restful import Api
from services import OrderService, OrderListService


app = Flask(__name__)
api = Api(app)


api.add_resource(OrderListService, '/rest/orders/')
api.add_resource(OrderService, '/rest/orders/<int:id>')

if __name__ == '__main__':
    app.run(debug=True)
