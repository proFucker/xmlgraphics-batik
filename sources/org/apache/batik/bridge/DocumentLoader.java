/*****************************************************************************
 * Copyright (C) The Apache Software Foundation. All rights reserved.        *
 * ------------------------------------------------------------------------- *
 * This software is published under the terms of the Apache Software License *
 * version 1.1, a copy of which has been included with this distribution in  *
 * the LICENSE file.                                                         *
 *****************************************************************************/

package org.apache.batik.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

/**
 * Defines a class that is responsible of loading (creating) a Document.
 *
 * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a>
 * @version $Id$
 */
public interface DocumentLoader {

    Document loadDocument(String uri) throws DOMException, SAXException;

}
