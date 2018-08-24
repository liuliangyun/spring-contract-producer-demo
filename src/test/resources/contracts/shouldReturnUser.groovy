org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/users'
    }
    response {
        status 200
        body("""
  {
    "id": 1,
    "name": "zhangsan"
  }
  """)
        headers {
            header('Content-Type': "application/json;charset=UTF-8")
        }
    }
}