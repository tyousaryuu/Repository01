$(function($){
	
	'use strict';	
	
	console.log('parentController');
	
	var parentController = {
		__name: 'zz.zz.ll.parentController',
		__construct: function(){
			console.log('parentController__constructer');
		},
		__init: function(){
			console.log('parentController__init');
		},
		__ready: function(){
			console.log('parentController__ready');
			this._childController.test();
		},
		_childController: zz.zz.ll.childController,

	}
	
	h5.core.expose(parentController);
	
	$(function(){
		h5.core.controller('#parent', parentController);
	});
 	
})(jQuery);