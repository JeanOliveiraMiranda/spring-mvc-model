<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SeuPhone - Última geração em suas mãos.</title>
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/folha.css" />
    <link rel="stylesheet" href="css/menu.css" />
    <link rel="stylesheet" href="css/responsivo.css" />
    <script src="js/script.js"></script>

    <!-- SWIPER -->
    <link rel="stylesheet" href="css/swiper.css">
    <script src="js/swiper.js"></script>

</head>
<body>

<!-- Menu de Navegação -->
<nav class="menu">
  <div class="container-menu">
    <!-- Icone Menu -->
    <span style="color: #fff; font-size:50px;cursor:pointer" onclick="abreMenu()">&#9776;</span>

    <!-- Menu Aberto -->
    <ul class="menu-nav">
      <a href="#" class="fechabtn" onclick="fechaMenu()">&times;</a>
      <li><a href="index.php">Home</a></li>
      <li><a href="index.php#produtos">Produtos</a></li>
      <li><a href="index.php#como-funciona">Como Funciona</a></li>
      <li><a href="index.php#sobre">Sobre</a></li>
      <li><a href="index.php#fale-conosco">Contato</a></li>
    </ul>

    <!-- Logo no Centro do Menu -->
    <a href="index.php" class="menu-logo">
      <img src="./img/menu-logo.png" alt="Logo" />
    </a>

    <!-- Entrar / Registrar -->

    <ul class="menu-login">

    </li>

      <li><a href="login.php">Entrar</a></li>
      <li><a href="cadastro.php">Registrar</a></li>
    </ul>
  </div>
</nav>


</body>
</html>