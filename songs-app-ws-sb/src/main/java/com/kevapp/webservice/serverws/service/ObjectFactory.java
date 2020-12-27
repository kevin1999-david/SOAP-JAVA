
package com.kevapp.webservice.serverws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kevapp.webservice.serverws.service package. 
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

    private final static QName _CreateSong_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "createSong");
    private final static QName _CreateSongResponse_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "createSongResponse");
    private final static QName _GetAllSongs_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "getAllSongs");
    private final static QName _GetAllSongsResponse_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "getAllSongsResponse");
    private final static QName _GetSong_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "getSong");
    private final static QName _GetSongResponse_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "getSongResponse");
    private final static QName _RemoveSong_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "removeSong");
    private final static QName _RemoveSongResponse_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "removeSongResponse");
    private final static QName _Song_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "song");
    private final static QName _UpdateSong_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "updateSong");
    private final static QName _UpdateSongResponse_QNAME = new QName("http://service.serverws.webservice.kevapp.com/", "updateSongResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kevapp.webservice.serverws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateSong }
     * 
     */
    public CreateSong createCreateSong() {
        return new CreateSong();
    }

    /**
     * Create an instance of {@link CreateSongResponse }
     * 
     */
    public CreateSongResponse createCreateSongResponse() {
        return new CreateSongResponse();
    }

    /**
     * Create an instance of {@link GetAllSongs }
     * 
     */
    public GetAllSongs createGetAllSongs() {
        return new GetAllSongs();
    }

    /**
     * Create an instance of {@link GetAllSongsResponse }
     * 
     */
    public GetAllSongsResponse createGetAllSongsResponse() {
        return new GetAllSongsResponse();
    }

    /**
     * Create an instance of {@link GetSong }
     * 
     */
    public GetSong createGetSong() {
        return new GetSong();
    }

    /**
     * Create an instance of {@link GetSongResponse }
     * 
     */
    public GetSongResponse createGetSongResponse() {
        return new GetSongResponse();
    }

    /**
     * Create an instance of {@link RemoveSong }
     * 
     */
    public RemoveSong createRemoveSong() {
        return new RemoveSong();
    }

    /**
     * Create an instance of {@link RemoveSongResponse }
     * 
     */
    public RemoveSongResponse createRemoveSongResponse() {
        return new RemoveSongResponse();
    }

    /**
     * Create an instance of {@link Song }
     * 
     */
    public Song createSong() {
        return new Song();
    }

    /**
     * Create an instance of {@link UpdateSong }
     * 
     */
    public UpdateSong createUpdateSong() {
        return new UpdateSong();
    }

    /**
     * Create an instance of {@link UpdateSongResponse }
     * 
     */
    public UpdateSongResponse createUpdateSongResponse() {
        return new UpdateSongResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSong }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "createSong")
    public JAXBElement<CreateSong> createCreateSong(CreateSong value) {
        return new JAXBElement<CreateSong>(_CreateSong_QNAME, CreateSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSongResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSongResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "createSongResponse")
    public JAXBElement<CreateSongResponse> createCreateSongResponse(CreateSongResponse value) {
        return new JAXBElement<CreateSongResponse>(_CreateSongResponse_QNAME, CreateSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSongs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSongs }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "getAllSongs")
    public JAXBElement<GetAllSongs> createGetAllSongs(GetAllSongs value) {
        return new JAXBElement<GetAllSongs>(_GetAllSongs_QNAME, GetAllSongs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSongsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSongsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "getAllSongsResponse")
    public JAXBElement<GetAllSongsResponse> createGetAllSongsResponse(GetAllSongsResponse value) {
        return new JAXBElement<GetAllSongsResponse>(_GetAllSongsResponse_QNAME, GetAllSongsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSong }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "getSong")
    public JAXBElement<GetSong> createGetSong(GetSong value) {
        return new JAXBElement<GetSong>(_GetSong_QNAME, GetSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSongResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSongResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "getSongResponse")
    public JAXBElement<GetSongResponse> createGetSongResponse(GetSongResponse value) {
        return new JAXBElement<GetSongResponse>(_GetSongResponse_QNAME, GetSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSong }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "removeSong")
    public JAXBElement<RemoveSong> createRemoveSong(RemoveSong value) {
        return new JAXBElement<RemoveSong>(_RemoveSong_QNAME, RemoveSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSongResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSongResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "removeSongResponse")
    public JAXBElement<RemoveSongResponse> createRemoveSongResponse(RemoveSongResponse value) {
        return new JAXBElement<RemoveSongResponse>(_RemoveSongResponse_QNAME, RemoveSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Song }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Song }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "song")
    public JAXBElement<Song> createSong(Song value) {
        return new JAXBElement<Song>(_Song_QNAME, Song.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSong }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSong }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "updateSong")
    public JAXBElement<UpdateSong> createUpdateSong(UpdateSong value) {
        return new JAXBElement<UpdateSong>(_UpdateSong_QNAME, UpdateSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSongResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSongResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.serverws.webservice.kevapp.com/", name = "updateSongResponse")
    public JAXBElement<UpdateSongResponse> createUpdateSongResponse(UpdateSongResponse value) {
        return new JAXBElement<UpdateSongResponse>(_UpdateSongResponse_QNAME, UpdateSongResponse.class, null, value);
    }

}
