#API
@GetMapping("/account/{acctID}/balance")
@PutMapping("/account/{acctID}/deposit/{amount}")
@PutMapping("/account/{acctID}/withdraw/{amount}")
@PutMapping("/account/{acctID}/transfer/{destAcctID}/{amount}")
@DeleteMapping("/account/{acctID}")
@GetMapping("/account/{acctID}")


Create User
@PostMapping("/user")

GetUser
@GetMapping("/user/{acctID}")

Delete User
@DeleteMapping("/user/{acctID}")


To generate JAR run below command, install maven

// mvn clean install
// look for jar inside target folder
