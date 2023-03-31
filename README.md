# Crud-Struts-2-JPA 👨‍💻

## About app 🎯

This application implements a crud to a table of person. You could found Crud operations in this project, an about the technologies this application uses:
- Java (JSF and Struts2)
- JPA (Java Persistence Api)
- MVC (Model View Controller)

## Preview 📸

### Main View (In this view you can delete a row) 
![Main View](https://github.com/JuanPatarroyo/Crud-Struts-2-JPA/blob/main/img/Preview_1.png?raw=true)
### Insert new row
![Main View](https://github.com/JuanPatarroyo/Crud-Struts-2-JPA/blob/main/img/Preview_2.png?raw=true)
### Update row
![Main View](https://github.com/JuanPatarroyo/Crud-Struts-2-JPA/blob/main/img/Preview_3.png?raw=true)

## Requirements 💻

- You need to create a persistence called "SgaPU" and a datasource "jdbc/PersonaDb", or just change their names in the file persistence.xml
- Create two tables: Persona and Usuario,
  - Persona has: id_persona, nombre, apellido, email, telefono, segundo_apellido, saldo
  - Usuario has: id_usuario, id_persona, username, password
- you could change the way to connect to the database, but remember the project works with JPA.

*Feel you free to use it* 🤓.
