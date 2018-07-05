/**
 * Esse código foi obtido na web.
 * 
 * Essa função serve para atualizar o conteúdo de uma div a partir de outra.
 * 
 * @param {type} param
 */
$(document).ready(function () {
    // inclui todos os links com id="ajax"    
    $("a#ajax").click(function () {        
        // carrega o conteúdo da página em HREF dentro da DIV #ajaxContent (id="ajaxContent")
        $("#ajaxContent").load($(this).attr("href"));
        // remove a ação do link para navegar até a página do HREF, pois ela já foi carregada na DIV
        return false;
    });
});
