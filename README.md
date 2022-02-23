0. Librerías
	web
	thymeleaf
1. El thymeleaf nos permite tener un MOTOR de PLANTILLAS más práctico que el tradicional MVC

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>

2. Según la documentación: hay que agregar un controlador que redirecciona la petición del usuario hacia alguna lógica de negocio.

3. Agregamos el HTML ( src/main/resources/templates/greeting.html) que se muestra al invocar al método creado en el controlador.


El flujo es:

0. Se levanta la aplicación
1. Se invoca desde el navegador: http://localhost:8080/greeting
2. Se ejecuta el controlador
	2.1 Almacena el valor en el Model
	2.2 Redirige a la vista que devulve en el return
3. Se pinta la vista cogiendo los valores en el Model