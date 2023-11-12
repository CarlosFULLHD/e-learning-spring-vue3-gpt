// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import {getStorage, ref, uploadBytes} from "firebase/storage";
// TODO: Add SDKs for Firebase products that you want to     use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyC0fmHsdM7bVB4L-XoBhPXaW2zIVLFOTHc",
  authDomain: "e-learning-cn.firebaseapp.com",
  projectId: "e-learning-cn",
  storageBucket: "e-learning-cn.appspot.com",
  messagingSenderId: "212738995575",
  appId: "1:212738995575:web:28c92b12b0f89d064d5d72",
  measurementId: "G-BGYS3K5Q1E"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
export const storage = getStorage(app);

// 'file' comes from the Blob or File API
export function uploadFile(file: Blob | Uint8Array | ArrayBuffer){
//Podemos importar uuid v4 que genera strings para dar id al azar

    const storageRef = ref(storage, 'url');
    uploadBytes(storageRef, file).then((snapshot) => {
        console.log('Uploaded a blob or file!');
      }); 
}
