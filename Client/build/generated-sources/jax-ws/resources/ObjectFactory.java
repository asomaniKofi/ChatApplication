
package resources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the resources package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewMessage_QNAME = new QName("http://Resources/", "NewMessage");
    private final static QName _Login_QNAME = new QName("http://Resources/", "Login");
    private final static QName _NewMessageResponse_QNAME = new QName("http://Resources/", "NewMessageResponse");
    private final static QName _Hello_QNAME = new QName("http://Resources/", "hello");
    private final static QName _History_QNAME = new QName("http://Resources/", "History");
    private final static QName _LoginResponse_QNAME = new QName("http://Resources/", "LoginResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://Resources/", "RegisterResponse");
    private final static QName _HistoryResponse_QNAME = new QName("http://Resources/", "HistoryResponse");
    private final static QName _Register_QNAME = new QName("http://Resources/", "Register");
    private final static QName _HelloResponse_QNAME = new QName("http://Resources/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: resources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link HistoryResponse }
     * 
     */
    public HistoryResponse createHistoryResponse() {
        return new HistoryResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link NewMessage }
     * 
     */
    public NewMessage createNewMessage() {
        return new NewMessage();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link NewMessageResponse }
     * 
     */
    public NewMessageResponse createNewMessageResponse() {
        return new NewMessageResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "NewMessage")
    public JAXBElement<NewMessage> createNewMessage(NewMessage value) {
        return new JAXBElement<NewMessage>(_NewMessage_QNAME, NewMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "NewMessageResponse")
    public JAXBElement<NewMessageResponse> createNewMessageResponse(NewMessageResponse value) {
        return new JAXBElement<NewMessageResponse>(_NewMessageResponse_QNAME, NewMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link History }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "History")
    public JAXBElement<History> createHistory(History value) {
        return new JAXBElement<History>(_History_QNAME, History.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "RegisterResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "HistoryResponse")
    public JAXBElement<HistoryResponse> createHistoryResponse(HistoryResponse value) {
        return new JAXBElement<HistoryResponse>(_HistoryResponse_QNAME, HistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "Register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Resources/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
