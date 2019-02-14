var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "241",
        "ok": "241",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5519",
        "ok": "5519",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3197",
        "ok": "3197",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1533",
        "ok": "1533",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2930",
        "ok": "2930",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4829",
        "ok": "4829",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5449",
        "ok": "5449",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5515",
        "ok": "5515",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 3,
        "percentage": 3
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 7,
        "percentage": 7
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 90,
        "percentage": 90
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "14.286",
        "ok": "14.286",
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
        "total": "100",
        "ok": "100",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "241",
        "ok": "241",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "5519",
        "ok": "5519",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3197",
        "ok": "3197",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1533",
        "ok": "1533",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2930",
        "ok": "2930",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4829",
        "ok": "4829",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5449",
        "ok": "5449",
        "ko": "-"
    },
    "percentiles4": {
        "total": "5515",
        "ok": "5515",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 3,
        "percentage": 3
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 7,
        "percentage": 7
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 90,
        "percentage": 90
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "14.286",
        "ok": "14.286",
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
