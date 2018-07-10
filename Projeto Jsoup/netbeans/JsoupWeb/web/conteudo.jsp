<jsp:useBean id="produtoAmericanas" scope="session" class="br.unesp.rc.jsoupDemo.model.Produto" />
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
                <tr>
                    <td><img alt="imagem" src=<%= produtoAmericanas.getImagem()%>></td>
                    <td><a href=<%= produtoAmericanas.getLinkProduto()%>><%= produtoAmericanas.getNome()%></a></td>
                    <td><%= produtoAmericanas.preco.getPreco()%></td>
                    <td><%= produtoAmericanas.preco.loja.getNome()%></td>
                </tr>
                <tr>
                    <td><img alt="imagem" src=<%= produtoMagalu.getImagem()%>></td>
                    <td><a href=<%= produtoMagalu.getLinkProduto()%>><%= produtoMagalu.getNome()%></a></td>
                    <td><%= produtoMagalu.preco.getPreco()%></td>
                    <td><%= produtoMagalu.preco.loja.getNome()%></td>
                </tr>
            </tbody>
        </table>
    </form>
</div>

<script>
    
function listaProdutos(){
    
}

</script>

</div>