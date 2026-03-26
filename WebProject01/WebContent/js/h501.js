$(function($){
	
	'use strict';
	
	console.clear();
	
	console.log('childController');
	
	var childController = {
		__name: 'zz.zz.ll.childController',
		__construct: function(){
			console.log('childController __constructer');
		},
		__init: function(){
			console.log('childController __init');
		},
		__ready: function(){
			console.log('childController __ready');
		},
		test: function(){
			console.log('childController   test');
		},

		'#child click': function(){
			alert('123');
		}
	}
	
	h5.core.expose(childController);
	
})(jQuery);