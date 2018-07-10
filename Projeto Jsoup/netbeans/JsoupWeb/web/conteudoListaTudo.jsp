<jsp:useBean id="produtoAmericanas" scope="session" class="br.unesp.rc.jsoupDemo.service.AmericanasService" />
<jsp:useBean id="produtoMagalu" scope="session" class="br.unesp.rc.jsoupDemo.service.MagazineLuizaService" />

<div class="grid-container">
    <div class="grid-x grid-margin-x">
        <div class="cell small-12">
            <hr>
        </div>
    </div>
</div>

<div class="grid-container">
    <h1>Resultados da busca</h1>
    <p id="listaProdutos"></p>
    <form>
        <table>
            <thead>
                <tr>
                    <th width="200"></th>
                    <th>Nome do produto</th>
                    <th width="150">Preço</th>
                    <th width="150">Loja</th>
                </tr>
            </thead>
            <tbody>               
                <%
                    for (int i = 0; i < produtoAmericanas.arrayProdutos.size(); i++){
                %>
                <tr>
                    <td><img alt="imagem" src=<%= produtoAmericanas.arrayProdutos.get(i).getImagem() %>></td>
                    <td>
                        <a href=<%= produtoAmericanas.arrayProdutos.get(i).preco.getLinkProduto() %>>
                            <%= produtoAmericanas.arrayProdutos.get(i).getNome() %>
                        </a>
                    </td>
                    <td><%= produtoAmericanas.arrayProdutos.get(i).preco.getPreco() %></td>
                    <td>
                        <a href=<%= produtoAmericanas.arrayProdutos.get(i).preco.loja.getUrlLoja()%>>
                            <img src="images/americanas.jpg" title=<%= produtoAmericanas.arrayProdutos.get(i).preco.loja.getNome()%>>
                        </a>
                    </td>
                </tr>
                <%}%>
                <%
                    for (int i = 0; i < produtoAmericanas.arrayProdutos.size(); i++){
                %>
                <tr>
                    <td><img alt="imagem" src=<%= produtoMagalu.arrayProdutos.get(i).getImagem() %>></td>
                    <td>
                        <a href=<%= produtoMagalu.arrayProdutos.get(i).preco.getLinkProduto() %>>
                            <%= produtoMagalu.arrayProdutos.get(i).getNome() %>
                        </a>
                    </td>
                    <td><%= produtoMagalu.arrayProdutos.get(i).preco.getPreco() %></td>
                    <td>
                        <a href=<%= produtoMagalu.arrayProdutos.get(i).preco.loja.getUrlLoja()%>>
                            <img src="images/americanas.jpg" title=<%= produtoMagalu.arrayProdutos.get(i).preco.loja.getNome()%>>
                        </a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </form>
</div>