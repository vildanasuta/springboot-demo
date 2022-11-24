# springboot-demo
1.	Empty working Spring Boot App built with Maven
2.	Has /hello-rest REST endpoint which returns ‘Hello World’ string
3.	Has /hello endpoint which returns an HTML page with ‘Hello World’ string displayed
4.	Has in-memory H2 database started with an initial set of 10 different strings per language (‘Hello World’ in 10 different languages) and /hello endpoints return the string determined by language parameter passed inside the query
5.	Has /secure/hello endpoint that requires the user to log in with a username and password (username: sa, password: password)
