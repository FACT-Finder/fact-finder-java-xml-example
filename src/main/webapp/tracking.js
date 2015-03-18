var tracking = {

	doTrack : function(eventName, channel, sessionId, extraParams) {
		var params = {
			event : eventName,
			channel : channel,
			sid : sessionId
		};
		for ( var param in extraParams) {
			if (extraParams[param] != null)
				params[param] = extraParams[param];
		}
		$.ajax({
			type : "GET",
			url : "proxy.jsp",
			data : params,
			contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			cache : false,
			async : true
		});
	},

	click : function(channel, sessionId, id, masterId, query, pos, origPos,
			page, origPageSize) {
		this.doTrack('click', channel, sessionId, {
			id : id,
			masterId : masterId,
			query : query,
			pos : pos,
			origPos : origPos,
			page : page,
			origPageSize : origPageSize
		});
	},

	cart : function(channel, sessionId, id, masterId, count, price) {
		this.doTrack('cart', channel, sessionId, {
			id : id,
			masterId : masterId,
			count : count,
			price : price
		});
	},

	directCart : function(channel, sessionId, id, masterId, query, pos,
			origPos, page, origPageSize, count, price) {
		this.click(channel, sessionId, id, masterId, query, pos, origPos, page,
				origPageSize);
		this.cart(channel, sessionId, id, masterId, count, price);
	},

	checkout : function(channel, sessionId, id, masterId, count, price) {
		this.doTrack('checkout', channel, sessionId, {
			id : id,
			masterId : masterId,
			count : count,
			price : price
		});
	},

	login : function(channel, sessionId, userId) {
		this.doTrack('login', channel, sessionId, {
			userId : userId
		});
	}
}