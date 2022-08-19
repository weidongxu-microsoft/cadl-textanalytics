# Cadl-Java for Text Analytics

## Generate the Java Package

See [script](./textanalytics/generate.sh).

## Convenience Method (Temporary)

Add `@convenienceMethod` decorator to the operation or interface that one wish to generate convenience methods.

For example, [@convenienceMethod on analyzeText](https://github.com/weidongxu-microsoft/cadl-textanalytics/blob/aad8132edee0dd0211115a6cd4b4830488d528f3/textanalytics/main.cadl#L61-L73) generates [convenience method](https://github.com/weidongxu-microsoft/cadl-textanalytics/blob/aad8132edee0dd0211115a6cd4b4830488d528f3/textanalytics/cadl-output/java/src/main/java/com/azure/language/textanalytics/TextAnalyticsAsyncClient.java#L219-L273), as well as related [models](https://github.com/weidongxu-microsoft/cadl-textanalytics/tree/aad8132edee0dd0211115a6cd4b4830488d528f3/textanalytics/cadl-output/java/src/main/java/com/azure/language/textanalytics/models).

## Reference

- [Cadl](https://github.com/microsoft/cadl)
- [Cadl Azure](https://github.com/Azure/cadl-azure/)
- [Cadl Java](https://github.com/Azure/autorest.java/tree/main/cadl-extension)
