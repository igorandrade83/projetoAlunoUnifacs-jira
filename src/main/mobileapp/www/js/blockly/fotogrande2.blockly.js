window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Fotogrande2 = window.blockly.js.blockly.Fotogrande2 || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Fotogrande2.mudaform2 = function(urlFoto) {
 var item, x;
  this.cronapi.screen.changeView("#/app/logged/fotogrande2",[ { urlFoto : urlFoto } ]);
}

/**
 * fotogrande2
 */
window.blockly.js.blockly.Fotogrande2.Executar = function() {
 var item, urlFoto, x;
  this.cronapi.screen.changeAttrValue("crn-image-892921", 'src', this.cronapi.screen.getParam('urlFoto'));
}
