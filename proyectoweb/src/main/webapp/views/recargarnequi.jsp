<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/estilos/recargarnequi.css">
    <title>Recargar Nequi</title>
</head>
<body>
 
    
    <div id="nombre">
        <img id="logo" src="assets/imagenes/logoprincipal.png" alt="">
        <header>
            <h1 id="title1">BOLSILLO </h1>
            <h1 id="title2">ELECTRONICO</h1>
        </header> 
     </div>
     <div id="iniciosesion">
        <h2 id="davip">Recargar Nequi</h2>
        <a href="banco?accion=volver"><button sr  id="buttoninicio">Cerrar Sesion</button></a>
    </div>




    <div id="esco">
        <div id="sub">
            <div id="menu">
                <br>
                <a href="banco?accion=retirar"><button id="botones">Sacar Dinero</button></a>
                <br>
                <a href="banco?accion=consultar"><button id="botones">Informacion De Tu Cuenta</button></a>
            </div>
            <div id="cuenta">
                <h2 id="cuen">Cuenta De Ahorros
                <br>
                cuenta de ahorros ****2403
                </h2>
            </div>
            <div id="form">
                <div id="transaccion">Recarga Nequi</div>
                <br>
                <div>
                <h3>Numero Celular</h3>
                <input id="espacio" type="tel" name=" numero" placeholder="Digita Celular">
                </div>
                <div>
                <h3>Monto A Recargar</h3>
                <input id="espacio" type="float" name="valor" placeholder="Digita El Monto">
                </div>
                <br>
                <a href="banco?accion=consultar"><button id="bto">recargar</button></a>
            </div>
        </div>
        </div>
    </div>


    <div id="info">
        <h2 id="inform"> 
        <br>
        <br>
        3195493401
        <br> 
        bolsilloelectronico@gmail.com
        </h2>
    </div>
    </html>
    