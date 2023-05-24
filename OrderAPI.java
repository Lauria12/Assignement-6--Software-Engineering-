import java.util.Date;

public interface OrderAPI {
    void setBookIdentifier(String bookIdentifier);

    String getBookIdentifier();

    void setQuantity(int quantity);

    int getQuantity();

    void setOrderDate(Date date);

    Date getOrderDate();
}

//API for managing orders

    openapi: 3.0.1
    info:
      title: Order API
      description: An API for managing orders
      version: 1.0.0
    servers:
        - url: http://localhost:8080
    paths:
        /orders:
            get:
            summary: Get all orders
            operationId: getOrders
            responses:
                '200':
                description: A list of orders
                content:
                    application/json:
                    schema:
                        type: array
                        items:
                        $ref: '#/components/schemas/Order'
            post:
            summary: Add a new order
            operationId: addOrder
            requestBody:
                description: Order to add
                required: true
                content:
                application/json:
                    schema:
                    $ref: '#/components/schemas/Order'
            responses:
                '200':
                description: Order added
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
        /orders/{identifier}:
            get:
            summary: Get an order by identifier
            operationId: getOrderByIdentifier
            parameters:
                - name: identifier
                in: path
                description: Order identifier
                required: true
                schema:
                    type: string
            responses:
                '200':
                description: Order found
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
                '404':
                description: Order not found
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
        /orders/{identifier}/cancel:
            post:
            summary: Cancel an order
            operationId: cancelOrder
            parameters:
                - name: identifier
                in: path
                description: Order identifier
                required: true
                schema:
                    type: string
            responses:
                '200':
                description: Order cancelled
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
                '404':
                description: Order not found
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
        /orders/{identifier}/ship:
            post:
            summary: Ship an order
            operationId: shipOrder
            parameters:
                - name: identifier
                in: path
                description: Order identifier
                required: true
                schema:
                    type: string
            responses:
                '200':
                description: Order shipped
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
                '404':
                description: Order not found
                content:
                    application/json:
                    schema:
                        $ref: '#/components/schemas/Order'
components:
    schemas:
        Order:
        type: object
        properties:
            identifier:
            type: string
            description: Order identifier
            bookIdentifier:
            type: string
            description: Book identifier
            quantity:
            type: integer
            description: Quantity ordered
            date:
            type: string
            format: date-time
            description: Order date
        Book:
        type: object
        properties:
            identifier:
            type: string
            description: Book identifier
            title:
            type: string
            description: Book title


