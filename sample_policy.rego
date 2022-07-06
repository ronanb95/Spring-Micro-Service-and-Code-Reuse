package allowDenyFoodOrder

data_retrieval_endpoint = "http://localhost:8083/justeat"

data = http.send(
    {
        "method":"GET",
        "url":data_retrieval_endpoint
    }
)

default allowOrder = false

allowOrder {
    m := input.food
    m == data.body[i]
}