# liquibase-issue
liquibase with spring boot unittest fails at includeAll:
includeAll doesn't see migration files in dependency jars.

## Steps to reproduce
1. Clone this repo
2. Run `mvn package`
3. You will receive failed test with message:
`Caused by: liquibase.exception.SetupException: Could not find directory or directory was empty for includeAll 'classpath*:/db/changelog/'`
