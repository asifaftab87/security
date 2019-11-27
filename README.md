# security

mysql query

INSERT INTO `rtone`.`user` (`active`, `email`, `first_name`, `last_name`, `password`) VALUES ('1', 'asif', 'asif', 'alam', '$2a$10$8a.zkqPj0xSn6fct3ykBbuyJ9xBAAbL9z0Orrfh/xBxRdH0fIM3Va');


here I m using email column as username.
for login purpose u have to use 
username : asif
password : pass

the pass bcrypt form is stored in mysql database;

for getting jwt token hit this url

localhost:8181/security/authenticate

method : post 
body -> raw -> JSON(application/json)

{
    "username" : "asif",
    "password" : "pass"
}


Then u will get jwt if all things are working properly

to check whether our application working 
then hit this url 

localhost:8181/security/hello

method : get

headers ->
Authorization : Bearer (here u have to add jwt value got from post api by passing username and password)

Thanks

