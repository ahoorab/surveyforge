/* 
 * surveyforge-core - Copyright (C) 2006 OPEN input - http://www.openinput.com/
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation; either version 2 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to 
 *   the Free Software Foundation, Inc., 
 *   59 Temple Place, Suite 330, 
 *   Boston, MA 02111-1307 USA
 *   
 * $Id$
 */
package org.surveyforge.core.metadata;

/**
 * Register data elements define data elements for a register. In contrast to an abstract data element a register data element is
 * defined in the context of a register and carries process information besides conceptual one.
 * 
 * @author jsegura
 */
public class RegisterDataElement extends DataElement
  {
  private static final long     serialVersionUID = -8986375207717119033L;

  /** The context data element describes the basic properties of the register data element. */
  private ConceptualDataElement conceptualDataElement;

  /**
   * Creates a new instance of ConceptualDataElement linked with a {@link ConceptualDataElement}.
   * 
   * @param conceptualDataElement The conceptualDataElement that describes the {@link RegisterDataElement}.
   * @throws NullPointerException If the ValueDomain or the identifier or the ConceptualDataElements are <code>null</code> or the
   *           identifier is empty.
   */
  public RegisterDataElement( ConceptualDataElement conceptualDataElement, ValueDomain valueDomain, String identifier )
    {
    super( valueDomain, identifier );
    this.setConceptualDataElement( conceptualDataElement );
    }

  /**
   * Returns the ConceptualDataElement that describes the RegisterDataElement.
   * 
   * @return Returns the conceptualDataElement.
   */
  public ConceptualDataElement getConceptualDataElement( )
    {
    return this.conceptualDataElement;
    }

  /**
   * Sets the ConceptualDataElement that describes the RegisterDataElement.
   * 
   * @param conceptualDataElement The conceptualDataElements to set.
   * @throws NullPointerException If the conceptualDataElement is <code>null</code>.
   */
  public void setConceptualDataElement( ConceptualDataElement conceptualDataElement )
    {
    if( conceptualDataElement != null )
      this.conceptualDataElement = conceptualDataElement;
    else
      throw new NullPointerException( );
    }


  }
