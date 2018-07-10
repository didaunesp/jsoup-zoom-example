<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="produtoAmericanas" scope="session" class="br.unesp.rc.jsoupDemo.service.AmericanasService" />
<jsp:useBean id="produtoMagalu" scope="session" class="br.unesp.rc.jsoupDemo.service.MagazineLuizaService" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Projeto Jsoup</title>
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.min.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/custom.css" />
        <link rel="stylesheet" href="css/jsoup.css" />
    </head>
    <body>
        <!-- TOPO DA PÁGINA-->
        <div id="topo">
            <%@include file="topo.jsp" %>
        </div>
        <!-- CORPO DA PÁGINA-->
        <div id="conteudo">
            <div class="grid-container">
    <div class="grid-x grid-margin-x">
        <div class="cell small-12">
            <hr>
        </div>
    </div>
</div>

<div class="grid-container">
    <h1>Produtos americanas</h1>
    <p id="listaProdutos"></p>
    <form>
        <table>
            <thead>
                <tr>
                    <th width="200"></th>
                    <th>Nome do produto</th>
                    <th width="150">Preço</th>
                    <th width="150">Data</th>
                    <th width="150">Loja</th>
                </tr>
            </thead>
            <tbody>
                 <% for(int i = 0; i < produtoAmericanas.arrayProdutos.size(); i+=1) { %>
                    <tr>
                        <td><img alt="imagem" src=<%= produtoAmericanas.arrayProdutos.get(i).getImagem() %>></td>
                        <td>
                            <a color="black" href=<%= produtoAmericanas.arrayProdutos.get(i).preco.getLinkProduto() %>>
                                <%= produtoAmericanas.arrayProdutos.get(i).getNome() %>
                            </a>
                        </td>
                        <td><%= produtoAmericanas.arrayProdutos.get(i).preco.getPreco()%></td>
                        <td><%= produtoAmericanas.arrayProdutos.get(i).preco.getData()%></td>
                        <td>
                            <a href="urlLoja">
                                <img src="images/americanas.jpg" title=<%= produtoAmericanas.arrayProdutos.get(i).preco.loja.getNome()%>>
                            </a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </form>
</div>

<div class="grid-container">
    <h1>Produtos Magazine Luiza</h1>
    <p id="listaProdutos"></p>
    <form>
        <table>
            <thead>
                <tr>
                    <th width="200"></th>
                    <th>Nome do produto</th>
                    <th width="150">Preço</th>
                    <th width="150">Data</th>
                    <th width="150">Loja</th>
                </tr>
            </thead>
            <tbody>
                 <% for(int i = 0; i < produtoMagalu.arrayProdutos.size(); i+=1) { %>
                    <tr>
                        <td><img alt="imagem" src=<%= produtoMagalu.arrayProdutos.get(i).getImagem() %>></td>
                        <td>
                            <a color="black" href=<%= produtoMagalu.arrayProdutos.get(i).preco.getLinkProduto() %>>
                                <%= produtoMagalu.arrayProdutos.get(i).getNome() %>
                            </a>
                        </td>
                        <td><%= produtoMagalu.arrayProdutos.get(i).preco.getPreco()%></td>
                        <td><%= produtoMagalu.arrayProdutos.get(i).preco.getData()%></td>
                        <td>
                            <a href="urlLoja">
                                <img src="images/magalu.png" title=<%= produtoMagalu.arrayProdutos.get(i).preco.loja.getNome()%>>
                            </a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </form>
</div>
        </div>
        <!-- RODAPÉ DA PÁGINA-->
        <div id="rodape">
            <%@include file="rodape.jsp" %>
        </div>

        <script src="foundation-6.4.2/js/app.js"></script>
        <script src="foundation-6.4.2/js/vendor/jquery.js"></script>
        <script src="foundation-6.4.2/js/vendor/what-input.js"></script>
        <script src="foundation-6.4.2/js/vendor/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
