<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>STAGEBANK</title>
    <link rel="stylesheet" href="CSS/DepositoScreen.css">
</head>
<body>
    <header>
        <div class="navbar">
            <ul class="navbar-user">
                <li class="navbar-itens">getNameUser</li>
                <li class="navbar-itens">getBalanceUser</li>
            </ul>
            <ul class="navbar-options">
                <li> <a href="">ACESSAR OUTRA CONTA</a> </li>
                <li> <a href="http://localhost:8080/StageBank/">SAIR</a> </li>
            </ul>
        </div>
   </header>
   <section>
    <h1 class="title">DEPOSITO</h1>

    <form action="DepositoPage" class="form" method="POST">
        <p class="inputs">CPF DO DESTINATARIO: <input class="put" type="text" name="cpf"></p>
            </br>
        <p class="inputs">VALOR DO DEPOSITO: <input class="put" type="text" name="value_deposit"> </p>
            </br>
        <input class="submit" type="submit" value="REALIZAR DEPOSITO">
    </form>
   </section>
</body>
</html>