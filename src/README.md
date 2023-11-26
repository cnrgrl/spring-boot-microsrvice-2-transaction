# Spring Boot Microservice 2 - Transaction Service

### Endpoints

#### 1- Save Transaction 

```
POST /api/transaction HTTP/1.1
Host: localhost:4444
{
"userId": 1,
"productId": 1
}
```

#### 1- Get Transaction of User

```
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
{
    "userId": 2,
    "productId": 2
}
```
#### 1- Delete Transaction of User

```
DELETE /api/transaction/2 HTTP/1.1
Host: localhost:4444
{
    "userId": 2,
    "productId": 2
}
```