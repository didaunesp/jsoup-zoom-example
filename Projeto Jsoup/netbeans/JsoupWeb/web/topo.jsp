<jsp:useBean id="busca" scope="session" class="br.unesp.rc.jsoupDemo.model.Produto" />

<div class="background fundoPreto">
    <div class="grid-container">
        <div class="grid-x grid-margin-x">
            <div class="cell small-12">
                <h2 class="whiteBold">Projeto Jsoup</h2>
                <p class="whiteBold">Ache os melhores preços do mercado!</p>
            </div>
            <div class="heigh100">
                &nbsp;
            </div>
            <div class="cell small-10 show-for-large show-for-medium">
                <!-- CAMPO DE PESQUISA -->
                <input type="search" name="search" placeholder="Digite o termo de busca" class="animated-search-form">
            </div>
            <div class="heigh100">
                &nbsp;
            </div>
            <div class="cell center">
                <form action="Pesquisar">
                    <p class="left"> <input type="submit" class="button" value="Buscar"> </p>
                </form>
            </div>
        </div>
    </div>
</div>
