package com.gg.phnx.learningjourneyprovider.controller;

import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junitsupport.loader.PactFolder;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Provider("helloworld-demo-provider")
@PactFolder("pacts")
@PactBroker(
    host = "hakobe.pactflow.io",
    authentication = @PactBrokerAuth(token = "bZCMbZnsXOhPJ0x4H6wVUg"),
    scheme = "https",
    enablePendingPacts = "true",
    includeWipPactsSince = "2021-08-01",
    providerTags = "main"
)
class MessageControllerProviderTest {

    @State("default state")
    void testMessage() {
    }

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }
}
