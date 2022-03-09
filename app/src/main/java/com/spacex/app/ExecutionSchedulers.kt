package com.spacex.app

import io.reactivex.Scheduler

interface ExecutionSchedulers {
    val subscribeScheduler: Scheduler
    val observeScheduler: Scheduler
}