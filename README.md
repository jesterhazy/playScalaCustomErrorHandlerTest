# play scala ignores custom error handler

## Steps to reproduce
- `play run`
- go to `http://localhost:9000/error`. you will see standard error message instead
  of the error defined in `global.CustomHttpErrorHandler.scala` ("This is a custom error message!")
- You can also see that the DefaultHttpErrorHandler is being called by inspecting the console stack trace:

```

play.api.http.HttpErrorHandlerExceptions$$anon$1: Execution exception[[Exception: an error!]]
	at play.api.http.HttpErrorHandlerExceptions$.throwableToUsefulException(HttpErrorHandler.scala:265) ~[play_2.11-2.4.6.jar:2.4.6]
	at play.api.http.DefaultHttpErrorHandler.onServerError(HttpErrorHandler.scala:191) ~[play_2.11-2.4.6.jar:2.4.6]
    ... 
```
