<%@page import="java.text.NumberFormat"%>
<jsp:useBean id="produtoAmericanas" scope="session" class="br.unesp.rc.jsoupDemo.service.AmericanasService" />
<jsp:useBean id="produtoMagalu" scope="session" class="br.unesp.rc.jsoupDemo.model.Produto" />

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
                int indiceMenorPreco = 0;
                String valor0 = produtoAmericanas.arrayProdutos.get(0).preco.getPreco().replace("R$", "");
                valor0 = valor0.replace(",", "");
                Double menor = Double.parseDouble(valor0.trim());
                for (int i = 0; i < produtoAmericanas.arrayProdutos.size(); i++){
                    String valor1 = produtoAmericanas.arrayProdutos.get(i).preco.getPreco().replace("R$", "");
                    valor1 = valor1.replace(",", "");
                    Double valor2 = Double.parseDouble(valor1.trim());
                    if (valor2 < menor) {
                        menor = valor2;
                        indiceMenorPreco = i;
                    }
                }    
                %>
                <tr>
                    <td><img alt="imagem" src=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).getImagem() %>></td>
                    <td>
                        <a color="black" href=<%= produtoAmericanas.arrayProdutos.get(indiceMenorPreco).preco.getLinkProduto() %>>
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
                <tr>
                    <td><img alt="imagem" src=<%= produtoMagalu.getImagem()%>></td>
                    <td><a href=<%= produtoMagalu.preco.getLinkProduto()%>><%= produtoMagalu.getNome()%></a></td>
                    <td><%= produtoMagalu.preco.getPreco()%></td>
                    <td>
                        <a href=<%= produtoMagalu.preco.loja.getUrlLoja()%>>
                            <img src="images/magalu.png" title=<%= produtoMagalu.preco.loja.getNome()%>>
                        </a>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
</div>

<script>
    
function listaProdutos(){
    console.log("deu certo");
}

</script>

</div>