
# Tema 3 





## Authors

- [Pavel Calin](https://github.com/CalinPavel)


## API Reference

#### create an endpoint that can display all orders belonging to a customer

```http
  GET /api/v1/user-postal-details/{username}
```

#### create an endpoint that can display all orders belonging to a customer

```http
  GET /api/v1/orders/{customerId}
```

#### create an endpoint which displays all products

```http
  GET /api/v1/getAllProducts
```

#### create a new customer

```http
  POST /api/v1/createCustomer
```

#### create products in the database

```http
  POST /api/v1/insertProduct
```

#### add 5 products to an order belonging to the customer

```http
  POST /api/v1/addOrderWithProducts/{count}
```




## Demo

#### Task1: /api/v1/createCustomer

    {
        "username": "Calin15",
        "last_name": "Pavel",
        "first_name": "Calin",
        "phone": "123-456-7890",
        "address": "Main St",
        "city": "Brasov",
        "postalCode": "12345",
        "country": "Romania"
    }

#### Task2: /api/v1/insertProduct

    {
        "name": "Example Product",
        "description": "This is an example product.",
        "stock": 100,
        "price": 29.99
    }

#### Task3: /api/v1/addOrderWithProducts/5

    {
        "customerId": "1",
        "orderId": "1",
        "productId": "1"
    }

#### Task4:

    {
        "order_date": "2023-08-29T12:00:00Z",
        "shipped_date": null,
        "status": "Pending",
        "comments": "This is a test order.",
        "customer": {
            "id": 1
        }
    }

