window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Exibirimg = window.blockly.js.blockly.Exibirimg || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Exibirimg.mudaForm = function(MudaTudo) {
 var item, x;
  this.cronapi.screen.changeView("#/app/logged/fotogrande",[ { id : MudaTudo } ]);
}

/**
 * exibirimg
 */
window.blockly.js.blockly.Exibirimg.alimentaHidden = function() {
 var item, MudaTudo, x;
  this.cronapi.screen.changeValueOfField("vars.qsId", this.cronapi.screen.getParam('idDaFoto'));
  this.cronapi.util.callServerBlocklyNoReturn('blockly.FotoGrande:PassaUrl');
}
