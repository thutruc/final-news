/**
 * @license Copyright (c) 2003-2014, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.html or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	var duong_dan='/FinalNews/';
    config.filebrowserBrowseUrl         =duong_dan+ 'resources/ckfinder/ckfinder.html';
    config.filebrowserImageBrowseUrl  	=duong_dan+ 'resources/ckfinder/ckfinder.html?type=Images';
    config.filebrowserFlashBrowseUrl 	=duong_dan+ 'resources/ckfinder/ckfinder.html?type=Flash';
    config.filebrowserUploadUrl 	=duong_dan+ 'resources/ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Files';
    config.filebrowserImageUploadUrl 	=duong_dan+ 'resources/ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Images';
    config.filebrowserFlashUploadUrl 	=duong_dan+ 'resources/ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Flash';
};
