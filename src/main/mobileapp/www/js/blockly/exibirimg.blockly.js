window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Exibirimg = window.blockly.js.blockly.Exibirimg || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Exibirimg.mudaForm = function(idFoto) {
 var item;
  this.cronapi.screen.changeView("#/app/logged/fotogrande",[ { idFoto : idFoto } ]);
}

/**
 * exibirimg
 */
window.blockly.js.blockly.Exibirimg.alimentaHidden = function() {
 var item, idFoto;
  this.cronapi.screen.changeValueOfField("vars.qsId", this.cronapi.screen.getParam('idFoto'));
  this.cronapi.util.callServerBlocklyNoReturn('blockly.FotoGrande:PassaUrl');
}
