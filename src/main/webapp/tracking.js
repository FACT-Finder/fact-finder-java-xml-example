var tracking = {

	doTrack : function(eventName, channel, sessionId, id, masterId, extraParams) {
		var params = {
			event : eventName,
			channel : channel,
			sid : sessionId,
			id : id,
			masterId : masterId
		};
		for ( var param in extraParams) {
			if (extraParams[param] != null)
				params[param] = extraParams[param];
		}
		// send information as utf-8 encoded post
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
		this.doTrack('click', channel, sessionId, id, masterId, {
			query : query,
			pos : pos,
			origPos : origPos,
			page : page,
			origPageSize : origPageSize
		});
	},

	cart : function(channel, sessionId, id, masterId, count, price) {
		this.doTrack('cart', channel, sessionId, id, masterId, {
			count : count,
			price : price
		});
	},

	checkout : function(channel, sessionId, id, masterId, count, price) {
		this.doTrack('checkout', channel, sessionId, id, masterId, {
			count : count,
			price : price
		});
	}

}; // end of tracking instance
