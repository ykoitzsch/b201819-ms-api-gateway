var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "400",
        "ok": "400",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "139",
        "ok": "139",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "8287",
        "ok": "8287",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "5658",
        "ok": "5658",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1900",
        "ok": "1900",
        "ko": "-"
    },
    "percentiles1": {
        "total": "6004",
        "ok": "6004",
        "ko": "-"
    },
    "percentiles2": {
        "total": "7105",
        "ok": "7105",
        "ko": "-"
    },
    "percentiles3": {
        "total": "8108",
        "ok": "8108",
        "ko": "-"
    },
    "percentiles4": {
        "total": "8248",
        "ok": "8248",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 9,
        "percentage": 2
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 3,
        "percentage": 1
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 388,
        "percentage": 97
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "40",
        "ok": "40",
        "ko": "-"
    }
},
contents: {
"req_orderproducts-39a5b": {
        type: "REQUEST",
        name: "OrderProducts",
path: "OrderProducts",
pathFormatted: "req_orderproducts-39a5b",
stats: {
    "name": "OrderProducts",
    "numberOfRequests": {
        "total": "400",
        "ok": "400",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "139",
        "ok": "139",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "8287",
        "ok": "8287",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "5658",
        "ok": "5658",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1900",
        "ok": "1900",
        "ko": "-"
    },
    "percentiles1": {
        "total": "6004",
        "ok": "6004",
        "ko": "-"
    },
    "percentiles2": {
        "total": "7105",
        "ok": "7105",
        "ko": "-"
    },
    "percentiles3": {
        "total": "8108",
        "ok": "8108",
        "ko": "-"
    },
    "percentiles4": {
        "total": "8248",
        "ok": "8248",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 9,
        "percentage": 2
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 3,
        "percentage": 1
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 388,
        "percentage": 97
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "40",
        "ok": "40",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
