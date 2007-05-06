/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spbu.pldoctoolkit.graph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.NameInfo;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.NameInfoImpl;
import org.spbu.pldoctoolkit.graph.DrlElement;
import org.spbu.pldoctoolkit.graph.DrlGraphPlugin;
import org.spbu.pldoctoolkit.graph.DrlPackage;
import org.spbu.pldoctoolkit.graph.util.DrlResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spbu.pldoctoolkit.graph.impl.DrlElementImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DrlElementImpl extends EObjectImpl implements DrlElement {
	public static final String XSI_TYPE_NS = XMLResource.XSI_NS+":"+XMLResource.TYPE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "copyleft 2007";

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final Element NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Element node = NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrlElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DrlPackage.Literals.DRL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Element newNode) {
		Element oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrlPackage.DRL_ELEMENT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrlPackage.DRL_ELEMENT__NODE:
				return getNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrlPackage.DRL_ELEMENT__NODE:
				setNode((Element)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DrlPackage.DRL_ELEMENT__NODE:
				setNode(NODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DrlPackage.DRL_ELEMENT__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (node: ");
		result.append(node);
		result.append(')');
		return result.toString();
	}

	/*
	 * TODO is it correct to return getClass().getName() ?
	 */
	protected String getTagName() {
//		DrlFactory factory = DrlFactory.eINSTANCE.getDrlPackage().blablabla
		return getClass().getSimpleName();
	}
	
	protected final Document getDocument() {
		DrlResourceImpl resource = (DrlResourceImpl) this.eResource();
		if(resource != null) {
			return resource.getDrlDocument();
		}
		return null;
	}
	
	/**
	 * Initialize the current node respecting the feature it is being assigned with.
	 * 
	 * @param feature
	 */
	public void initializeNode(EStructuralFeature feature) {
		Resource resource = this.eResource();
		if(resource instanceof DrlResourceImpl) {
			DrlResourceImpl drlResource = (DrlResourceImpl) resource;
			Document drlDocument = drlResource.getDrlDocument();
			XMLHelper helper = drlResource.getHelper();
			
			if(drlDocument != null) {
				NameInfo nameInfo = new NameInfoImpl();
		        helper.populateNameInfo(nameInfo, feature);
		        Element elem = drlDocument.createElementNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName()); 
		        
				setNode(elem);
				updateAttributeNodes();
			} else {
				DrlGraphPlugin.logInfo("drldoc empty");
			}
		}
	}
	
	/**
	 * This method is needed to update the attributes values or create ones if necessary.
	 * 
	 * This method adds "xsi:type" attribute if needed.
	 * 
	 * Derived classes should override this method to update their specific attributes. 
	 */
	public void updateAttributeNodes() {
		// default implementation is empty
		if (needTypeInfo()) {
			DrlResourceImpl resource = (DrlResourceImpl) this.eResource();
			XMLHelper helper = resource.getHelper();
			NameInfo nameInfo = new NameInfoImpl();
			Element elem = getNode();
			
			helper.populateNameInfo(nameInfo, this.eClass());
			elem.setAttributeNS(ExtendedMetaData.XSI_URI,
					XSI_TYPE_NS, nameInfo.getQualifiedName());
		}
		
	}
	
	protected boolean needTypeInfo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.EObjectImpl#eBasicSetContainer(org.eclipse.emf.ecore.InternalEObject, int)
	 */
//	@Override
//	protected void eBasicSetContainer(InternalEObject newContainer,
//			int newContainerFeatureID) {
//		
//		DrlElement oldContainer = (DrlElement) eContainer();
//		
//		super.eBasicSetContainer(newContainer, newContainerFeatureID);
//
//		if(getNode() == null) {
//			EStructuralFeature feature = this.eContainingFeature();
//			initializeNode(feature);
//		}
//		
//		Element node = getNode();
//		
//		// remove from prev container if any and not equal to the new one
//		if(oldContainer != null && !oldContainer.equals(newContainer)) {
//			Node parent = node.getParentNode();
//			if(parent != null) {
//				parent.removeChild(node);
//			}
//		}
//		
//		if(newContainer != null) {
//			Element plNode = ((DrlElement)newContainer).getNode();
//
//			if(!containsAsChild(plNode, node)) {
//				//TODO respect index
//				plNode.appendChild(getNode());
//			}
//		}
//		
//	}

	private boolean containsAsChild(Element parent, Element node) {
		if(node == null) {
			return false;
		}
		
		boolean result = false;
		NodeList children = parent.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			if(node.isSameNode(children.item(i))) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
//	/* (non-Javadoc)
//	 * HAND fully
//	 * 
//	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#eBasicRemoveFromContainer(org.eclipse.emf.common.notify.NotificationChain)
//	 */
//	@Override
//	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
//		Element node = getNode();
//		if(node != null) {
//			Node parent = node.getParentNode();
//			if(parent != null) {
//				parent.removeChild(node);
//			}
//		}
//		
//		return super.eBasicRemoveFromContainer(msgs);
//	}

} //DrlElementImpl
