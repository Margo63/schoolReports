## Технологии

Язык: Java (Spring Boot)   
API Документация: OpenAPI 3.1 (Swagger)   
База данных: PostgreSQL   
Контейнеризация: Docker   
Аутентификация: JWT Token   

Swagger UI: http://localhost:8082/swagger-ui/index.html   
API документация: http://localhost:8082/v3/api-docs   

## Для регистрации пользователя передавать id НЕ нужно

## Запросы

### пример создания справки (POST), все разделы создадутся автоматически

/api/unit/initReference

```json
{
    "id": 0,
    "organizationName": "Новая организация",
    "postalAddress": "Адрес",
    "okudFormCode": "000000",
    "okpoOrgCode": "000000000",
    "changeDate1": "2026-01-23T19:37:32.1992",
    "changeNumber1": "INIT-001",
    "changeDate2": "2026-01-23T19:37:32.1992",
    "changeNumber2": "INIT-002"
}

```

### Получение списка организаций с пагинацией GET

/api/unit/getMainInfoList

Параметры: pageable
Пример запроса:
```text
GET /api/unit/getMainInfoList?page=0&size=10
```
Ответ:
```json

{
    "totalPages": 5,
    "totalElements": 47,
    "size": 10,
    "content": [
        {
            "id": 1,
            "organizationName": "МБОУ Лицей №1",
            "postalAddress": "г. Москва, ул. Ленина, д. 1",
            "okudFormCode": "123456",
            "okpoOrgCode": "987654321",
            "changeDate1": "2026-01-23T19:37:32.2222",
            "changeNumber1": "CHG-001",
            "changeDate2": "2026-01-23T19:37:32.2222",
            "changeNumber2": "CHG-002"
        }
    ]
}

```


### пример обновления раздела (PUT)

Запрос: /api/unit/updateUnit18
```json
{
    "id": 1,
    "internalDigitalTechCostsTotal": 150000,
    "ownFunds": 50000,
    "budgetFunds": 80000,
    "otherAttractedFunds": 20000
}
```
### пример получения раздела (GET)
Запрос: /api/unit/getUnit18
Параметры: id (required)
Ответ (Unit18):
```json
{
    "internalDigitalTechCostsTotal": 150000,
    "ownFunds": 50000,
    "budgetFunds": 80000,
    "otherAttractedFunds": 20000
}
```




