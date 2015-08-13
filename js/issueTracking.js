var getResult;

var numFeature = 0;
var numFix = 0;
var numCritical = 0;
var numClosed = 0;

$.get("https://api.github.com/repos/ThatOneReaper/minecraft-PortalMod/issues?state=all", function(data) {
	getResult = data;
	console.log(getResult);
	data.forEach(function(issue) {
		console.log(issue);
		if(issue.state === "closed") {
			console.log("closed");
			numClosed ++;
		} else {
			issue.labels.forEach(function(label) {
				switch(label.name) {
					case "Bug / Fix":
					case "Fix":
						numFix ++;
						break;
					case "Critical Issue":
						numCritical ++;
						break;
					case "New Feature":
						numFeature ++;
						break;
				}
			});
		}
	});
	$("#featureBadge").text(numFeature);
	$("#fixBadge").text(numFix);
	$("#criticalBadge").text(numCritical);
	$("#completedBadge").text(numClosed);
});