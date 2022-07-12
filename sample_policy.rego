package allowBitCoinPurchase

data_retrieval_endpoint = "http://localhost:8083/coinprices"

data = http.send(
    {
        "method":"GET",
        "url":data_retrieval_endpoint
    }
)

default allowPurchase = false

allowPurchase {
    currency := input.currency
    currency == "usd"
    price := data.usd
    price < 20000
}