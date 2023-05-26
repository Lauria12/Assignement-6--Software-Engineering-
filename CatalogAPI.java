public interface CatalogAPI {
    void addBook(Book book);

    Book getBook(String identifier);

    void update(Book book);

    public void delete(String identifier);

}

    //API for the Catalog
    openapi: 3.0.1
    info:
      title: Catalog API
      description: An API for managing a book catalog
      version: 1.0.0
    servers:
        - url: http://localhost:8080
paths:
    /catalog:
        get:
        summary: Get all books
        operationId: getBooks
        responses:
            '200':
            description: A list of books
            content:
                application/json:
                schema:
                    type: array
                    items:
                    $ref: '#/components/schemas/Book'
        post:
        summary: Add a new book
        operationId: addBook
        requestBody:
            description: Book to add
            required: true
            content:
            application/json:
                schema:
                $ref: '#/components/schemas/Book'
        responses:
            '200':
            description: Book added
            content:
                application/json:
                schema:
                    $ref: '#/components/schemas/Book'
    /catalog/{identifier}:
        get:
        summary: Get a book by identifier
        operationId: getBookByIdentifier
        parameters:
            - name: identifier
            in: path
            description: Book identifier
            required: true
            schema:
                type: string
        responses:
            '200':
            description: A book
            content:
                application/json:
                schema:
                    $ref: '#/components/schemas/Book'
        put:
        summary: Update a book
        operationId: updateBook
        parameters:
            - name: identifier
            in: path
            description: Book identifier
            required: true
            schema:
                type: string
        requestBody:
            description: Book to update
            required: true
            content:
            application/json:
                schema:
                $ref: '#/components/schemas/Book'
        responses:
            '200':
            description: Book updated
            content:
                application/json:
                schema:
                    $ref: '#/components/schemas/Book'
            '404':
            description: Book not found
        delete:
        summary: Delete a book
        operationId: deleteBook
        parameters:
            - name: identifier
            in: path
            description: Book identifier
            required: true
            schema:
                type: string
        responses:
            '200':
            description: Book deleted
            content:
                application/json:
                schema:
                    $ref: '#/components/schemas/Book'
            '404':
            description: Book not found
components:
    schemas:
        Book:
        type: object
        required:
            - identifier
            - title
            - author
            - price
        properties:
            identifier:
            type: string
            description: Book identifier
            title:
            type: string
            description: Book title


