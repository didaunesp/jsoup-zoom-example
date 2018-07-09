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
    Nome: <%= produto.getNome()%> <br>
    Preco: <%= produto.preco.getPreco()%> <br>
    Loja: <%= produto.preco.loja.getNome()%> <br>
</div>

<div class="grid-container">

</div>