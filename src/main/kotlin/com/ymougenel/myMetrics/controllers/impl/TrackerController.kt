package com.ymougenel.myMetrics.controllers.impl

import com.ymougenel.myMetrics.models.Metric
import com.ymougenel.myMetrics.models.Tracker
import io.swagger.annotations.Api
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping(path = arrayOf("/trackers"))
@Api(description = "Tracker Controller")
class TrackerController {

    /**
     * Return all the metrics needed to be filled today
     * NOTE: this is a dummy implementation, and will be improved later on
     */
    @GetMapping(path = arrayOf("/"), produces = [(MediaType.APPLICATION_JSON_UTF8_VALUE)])
    fun getAll(): List<Tracker> {
        var trackers = ArrayList<Tracker>()
        trackers.add(Tracker(0,"Sport"))
        return trackers
    }


}