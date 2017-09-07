
		var main = document.querySelector('th [type="checkbox"]'), 
		all = document.querySelectorAll('td > [type="checkbox"]');
		var button = document.querySelector('#delBtn');
		
		for (var i = 0; i < all.length; i++) { 
			all[i].onclick = function() {
				var allChecked = document
						.querySelectorAll('td > [type="checkbox"]:checked').length;
				main.checked = allChecked == all.length;
				main.indeterminate = allChecked > 0 && allChecked < all.length;
				if(allChecked>0){ button.disabled=false;}
				else{   button.disabled=true;}
			}
		}

		main.onclick = function() {
			for (var i = 0; i < all.length; i++) {
				all[i].checked = this.checked;
			}
			if(main.checked){ button.disabled=false;}
			else{   button.disabled=true;}
		}
		
