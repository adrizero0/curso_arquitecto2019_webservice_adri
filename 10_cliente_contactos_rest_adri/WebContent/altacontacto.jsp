<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h1>Alta</h1>
  <br/>
  <form action="doAltaContacto" method="post">
    <div class="input-group">
  	 	<span class="input-group-addon">Nombre</span>
    	<input id="email" type="text" class="form-control" name="nombre" placeholder="nombre" required="required">
	</div>
	<div class="input-group">
  	 	<span class="input-group-addon">Email</span>
    	<input id="email" type="text" class="form-control" name="email" placeholder="email" >
	</div>
	<div class="input-group">
  	 	<span class="input-group-addon">Edad</span>
    	<input id="email" type="number" class="form-control" name="edad" placeholder="edad" >
	</div>
	
  	<br/>
    <button type="submit" class="btn btn-default btn-primary" style="width:100%"> Guardar</button>    
  </form>
  <br/><br/>
  <a href="toEntrada">Volver</a>
</div>

</body>
</html>
