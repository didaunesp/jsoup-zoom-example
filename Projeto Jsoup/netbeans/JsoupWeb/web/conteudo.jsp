<jsp:useBean id="produto" scope="session" class="br.unesp.rc.jsoupDemo.model.Produto" />

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
                    <td><img alt="imagem" src=<%= produto.getImagem()%>></td>
                    <td><a href=<%= produto.getLinkProduto()%>><%= produto.getNome()%></a></td>
                    <td><%= produto.preco.getPreco()%></td>
                    <td><%= produto.preco.loja.getNome()%></td>
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