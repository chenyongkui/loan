$(function(){
	$.ajax({
		url:'http://120.76.203.19:8090/shzc_test/WEB-PC/app/recommendInvestRank.do',
		data:{},
		success:function(result){
			if(result.error=='0'){
				var investRank = result.investRank;
				var commend = result.recommendUserRank;
				var invest = $('#invest');
				var oCommend = $('#commend');
				for(var i =0;i<10;i++){
					$('<li class="list'+i+'"><div><p class="one">'+investRank[i].rank+'</p><p class="two">'+investRank[i].mobilePhone+'</p><p class="three">'+formatCurrency(investRank[i].investAmount)+'</p></div></li>')
					.appendTo(invest);
					$('<li class="list'+i+'"><div><p class="one">'+commend[i].rank+'</p><p class="two">'+commend[i].mobilePhone+'</p><p class="three">'+commend[i].num+'</p></div></li>')
					.appendTo(oCommend);
				}
			}
		}
	})
});

function formatCurrency(value) {
	value = parseFloat(value).toFixed(2);
	var sb = '',ls = value.substring(value.indexOf('.'));
	for (var i=0, len=value.length-3; i<len; i++) {
		sb += value.charAt(i);
		if ((i+1) % 3 == len % 3 && (i+1) != len) {
			sb += ',';
		}
	}
	return sb+ls;
};