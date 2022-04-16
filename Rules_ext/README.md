mvn clean compile quarkus:dev
-------------------------------
mvn clean package quarkus:dev
-----------------------------
**********************************


input
-------------------------------------------------------------------------

curl -X 'POST' \
  'http://localhost:8080/change' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "changerequests": [
    {
      "changeType": "NAME"
      
    }
  ]
}'

---------------------------------------------------------------------------
Output
---------------------------------------------------------------------------

[
  {
    "requestIdList": [
      1,
      2
    ],
    "changeType": "NAME",
    "reasonResponses": [
      {
        "reasonId": 1,
        "docIdList": [
          1,
          2,
          3,
          4,
          5,
          6
        ],
        "reasonDescription": "INCORRECTLY_TYPED_AT_TIME_OF_AOB"
      },
      {
        "reasonId": 2,
        "docIdList": [
          1,
          2,
          3
        ],
        "reasonDescription": "GOT_MARRIED_AND_NAME_CHANGED"
      }
    ]
  }
]

----------------------------------------------------------------------------------


