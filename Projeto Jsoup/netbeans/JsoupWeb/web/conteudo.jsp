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
                <% int indiceMenorPreco = produtoAmericanas.pegaMenorPreco(); %>
                <tr>
                    <td><img alt="imagem" src=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).getImagem() %>></td>
                    <td>
                        <a href=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).preco.getLinkProduto() %>>
                            <%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).getNome() %>
                        </a>
                    </td>
                    <td><%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).preco.getPreco() %></td>
                    <td>
                        <a href=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).preco.loja.getUrlLoja()%>>
                            <img src="images/americanas.jpg" title=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).preco.loja.getNome()%>>
                        </a>
                    </td>
                </tr>
                <% int indiceMenorPreco2 = produtoMagalu.pegaMenorPreco(); %>
                <tr>
                    <td><img alt="imagem" src=<%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).getImagem() %>></td>
                    <td>
                        <a href=<%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).preco.getLinkProduto() %>>
                            <%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).getNome() %>
                        </a>
                    </td>
                    <td><%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).preco.getPreco() %></td>
                    <td>
                        <a href=<%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).preco.loja.getUrlLoja()%>>
                            <img src="images/americanas.jpg" title=<%= produtoMagalu.arrayProdutos.get(indiceMenorPreco2).preco.loja.getNome()%>>
                        </a>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
</div>